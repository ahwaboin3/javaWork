package makeclass;

public class Lotto {
	
	int[] nums;

	public Lotto() {
	}
	
	public Lotto(int[] nums) {
		this.nums = nums;
	}

	void getNums(){
		for(int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	//1~45까지 랜덤한 수 6개 추출
	void getRans() {
		int[] rans=new int[6];
		for(int i=0;i<6;i++) {
			rans[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(rans[i]==rans[j]) {
					i--;
					break;
				}
			}
		}
		nums=rans;
	}
	
	
	public static void main(String[] args) {
		Lotto l1=new Lotto(new int[]{1,2,3,4,6});
		int[] nums= {2,3,4,5,6};
		Lotto l2=new Lotto(nums);
		Lotto l3=new Lotto(new int[]{1,2,3,4,6});
		Lotto l4=new Lotto(new int[]{1,2,3,4,6});
		Lotto l5=new Lotto(new int[]{1,2,3,4,6});
		Lotto[] lottos=new Lotto[5];
		lottos[0]=l1;
		lottos[1]=l2;
		lottos[2]=l3;
		lottos[3]=l4;
		lottos[4]=l5;
		for(Lotto l:lottos) {
			l.getNums();
		}
		//100점
		
		//랜덤한 번호로 로또 번호 만들기
		Lotto r=new Lotto();
		r.getRans();
		r.getNums();
		
	}
	
}









