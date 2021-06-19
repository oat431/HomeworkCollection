import functools

class Solution:
    def findMinStep(self, board: str, hand: str) -> int:
        self.min_moves = float("inf")

        @functools.lru_cache(None)
        def zuma_hit(board: tuple) -> tuple:
            ball = []
            N = len(board)
            i = 0
            hit_again = False
            while i < N:
                j = i
                while j < N and board[j] == board[i]:
                    j += 1
                if j - i <= 2:
                    ball.extend(board[i:j])
                else:
                    hit_again = True
                i = j
            ball = tuple(ball)
            if hit_again:
                ball = zuma_hit(ball)
            return ball

        @functools.lru_cache(None)
        def depth_first_seach(board: tuple, hand: tuple, moves: int):
            hand = tuple(b for b in hand if b in board and (hand.count(b) + board.count(b)) >= 3)

            board = zuma_hit(board)

            if len(board) == 0:
                self.min_moves = min(self.min_moves, moves)
            elif len(hand) <= 0:
                return
            else:
                n = 0
                while n < len(hand):
                    zuma_ball = list(hand)
                    ball = zuma_ball.pop(n)

                    steps = set()

                    i = 0
                    count = 0
                    for j in range(len(board)):
                        if board[i] == board[j]:
                            count += 1
                        else:
                            i = j
                            count = 1
                        if count == 1 and board[i] == ball:
                            steps.add((i, ball))

                    for j in range(1, len(board)):
                        if j < (len(board) - 1):
                            if board[j-1] != ball and board[j+1] != ball:
                                steps.add((j, ball))

                    for i, k in steps:
                        after_hit = list(board)
                        after_hit.insert(i, k)
                        depth_first_seach(tuple(after_hit), tuple(zuma_ball), moves + 1)
                    n += 1

        depth_first_seach(tuple(board), tuple(sorted(list(hand))), 0)

        return self.min_moves if self.min_moves < float("inf") else -1

zuma = input().split(" ")
ans = Solution()
print(ans.findMinStep(zuma[0], zuma[1]))
