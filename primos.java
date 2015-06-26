class Primos{
	public int n;
	public int a;
	public int b;
	
	public void calculaPrimos(int y, int x){
		this.a=x;
		this.n=y;
		b=a-1;
		coco();
	}
	public void coco(){
		if(b>=1){
			calcula();
		}	
		a++;
		coco();
	}
	public void calcula(){
		if ((a%b==0)&&(b>1)){	
		
		}else if (b<2){
			System.out.print(a+", ");
			n++;
		}	
		b--;
		calcula();	
		b++;
	}
}
	/*
	
	while (n<20){		
			b=(a-1);
			while(b>=1){
				if ((a%b==0)&&(b>1)){
					break;	
				}else if (b<2){
					System.out.print(a+", ");
					n++;
				}					
				b--;
			}
			a++;
		}
	}
*/
