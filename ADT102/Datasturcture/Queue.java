
public class Queue{

		String[] i = new String[10];
		int q = 0;
		
		public void Queue(){
			for (int j =0 ; j<10; j++){
				i[j] = "0";
			}
			q = 0;
		}
		
		public void Enqueue(String a){
			i[q] = a;
			q++;
		}
		
		public void dequeue(){
			System.out.println(i[0]);
			for (int t =1; t<=q ; t++){
				i[t-1] = i[t];
			}
			q--;
		}
		
		public void isEmpty(){
			if(q!=9){
				System.out.println("true");
			}
			else{System.out.println("flase");}
		}
		
		public void front(){
			System.out.println(i[0]);
		}
		
		public void rear(){
			System.out.println(i[q-1]);
		}
		
		public void isFull() {
			if(q!=9){
				System.out.println("flase");
			}
			else{System.out.println("true");}
		}
		
		public void getSize() {
			System.out.println(q--);
		}

		  
    }
