def cat_hat(str):
    return str.count('cat') == str.count('hat')


def main():
    t = int(input())
    while t > 0:
        mystr = str(input())
        print(cat_hat(mystr))
        t -= 1

if __name__ == '__main__':
    main()
