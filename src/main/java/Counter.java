package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decreaseBy(int i) {
		count-=i;
	}
	
	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}
	
	public int getCount() {
		return count;
	}

	// === TAMBAHAN KODE BARU AGAR MEMENUHI SYARAT SONARQUBE (MINIMAL 20 BARIS) ===
	
	public void square() {
		this.multiplyBy(this.count);
	}

	public void divideBy(int i) {
		if (i != 0) {
			count = count / i;
		} else {
			System.out.println("Error: Tidak bisa dibagi dengan nol.");
		}
	}

	public boolean isCountPositive() {
		return count > 0;
	}

	public boolean isCountNegative() {
		return count < 0;
	}

	public void addBonusConstant() {
		int bonus = 10;
		count += bonus;
		System.out.println("Nilai bonus berhasil ditambahkan ke count.");
	}
	
}
