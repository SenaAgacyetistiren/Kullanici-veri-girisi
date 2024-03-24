import java.util.LinkedList;
import java.util.Scanner;

public class odev {

	public static void main(String[] args) {
	
		/*
				// 1.ODEV: Tek boyutlu 2 vektörü çarpınız ve toplayınız.

				int[] dizi1 = new int[4];
				int[] dizi2 = new int[4];

				for (int i = 0; i < dizi1.length; i++) {
					dizi1[i] = (int) (Math.random() * 100);
				}

				for (int i = 0; i < dizi1.length; i++) {
					System.out.print(dizi1[i] + " ");
				}

				System.out.println("\n");

				for (int i = 0; i < dizi2.length; i++) {
					dizi2[i] = (int) (Math.random() * 100);
				}

				for (int i = 0; i < dizi2.length; i++) {
					System.out.print(dizi2[i] + " ");
				}

				System.out.println("\n");

				System.out.print("Toplam: ");

				for (int i = 0; i < dizi1.length; i++) {
					for (int j = 0; j < dizi2.length; j++) {
						System.out.print(dizi1[i] + dizi2[j] + " ");
					}
				}
				System.out.println("\n");

				System.out.print("Çarpım: ");

				for (int i = 0; i < dizi1.length; i++) {
					for (int j = 0; j < dizi2.length; j++) {
						System.out.print(dizi1[i] * dizi2[j] + " ");
					}
				}
				

				System.out.println("\n------------------------------------");
			*/
		
		/*
				// 2.ODEV: 2 boyutlu kare matrisi çarpınız ve toplayınız.

		        int[][] dizi3 = new int[3][3];
		        int[][] dizi4 = new int[3][3];

		        // dizi3 ve dizi4'ü rastgele sayılarla doldurma
		        for (int i = 0; i < dizi3.length; i++) {
		            for (int j = 0; j < dizi3[i].length; j++) {
		                dizi3[i][j] = (int) (Math.random() * 15);
		                dizi4[i][j] = (int) (Math.random() * 15);
		            }
		        }

		        // dizi3 ve dizi4'ü ekrana yazdırma
		        System.out.println("Dizi 3:");
		        for (int i = 0; i < dizi3.length; i++) {
		            for (int j = 0; j < dizi3[i].length; j++) {
		                System.out.print(dizi3[i][j] + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("\nDizi 4:");
		        for (int i = 0; i < dizi4.length; i++) {
		            for (int j = 0; j < dizi4[i].length; j++) {
		                System.out.print(dizi4[i][j] + " ");
		            }
		            System.out.println();
		        }

		        // Toplam ve çarpım işlemlerini yapma
		         System.out.println("\nToplam:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print((dizi3[i][j] + dizi4[i][j]) + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("\nÇarpım:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print((dizi3[i][j] * dizi4[i][j]) + " ");
		            }
		            System.out.println();
		        }
		    */
		
		
				/*
				// 3.ODEV: Matrislerin içini random doldurunuz ve bu matrisleri çarpıp toplayınız.
				
				int[][] dizi5 = new int[2][2];
				int[][] dizi6 = new int[2][3];
				
				
				for (int i = 0; i < dizi5.length; i++) {
					for (int j = 0; j < dizi5[i].length; j++) {
						dizi5[i][j] = (int) (Math.random() * 15);
					}
				}
				
				System.out.println("Dizi 5: ");
				for (int i = 0; i < dizi5.length; i++) {
					for (int j = 0; j < dizi5[i].length; j++) {
						System.out.print(dizi5[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.print("\n");
				
				
				for (int i = 0; i < dizi6.length; i++) {
					for (int j = 0; j < dizi6[i].length; j++) {
						dizi6[i][j] = (int) (Math.random() * 15);
					}
				}
				
				System.out.println("Dizi 6:");
				for (int i = 0; i < dizi6.length; i++) {
					for (int j = 0; j < dizi6[i].length; j++) {
						System.out.print(dizi6[i][j] + " ");
					}
					System.out.println();
				}
				
				
				System.out.println("\nÇarpıp toplama: ");
				
				int toplam = 0;
				
				for (int i = 0; i < dizi5.length; i++) {
					for (int j = 0; j < dizi5[i].length; j++) {
						for (int m = 0; m < dizi6.length; m++) {
							for (int l = 0; l < dizi6[m].length; l++) {
								toplam += dizi5[i][j] * dizi6[m][l];
								System.out.print(toplam + " ");
							}
						}
					}
					System.out.println(toplam);
				}
				*/
		
		//4.ODEV
		//Dizinin elemanlarını kullanıcıdan alıp yazdırma.
		
		Scanner scanner = new Scanner(System.in);
		LinkedList<String > girisler = new LinkedList<>();
		String dizi,devam;
		
		boolean bittiMi= false;
		
		
		while(!bittiMi) {
			System.out.print("\nİstediğiniz isim, sayı dizisini girmeye başlayabilirsiniz : ");
			dizi= scanner.nextLine();
			girisler.add(dizi);
			
			System.out.print("\nBitti mi? (Evet/Hayır): ");
			devam= scanner.nextLine();
			
			
			if(devam.equalsIgnoreCase("evet")) {
				bittiMi = true;
				break;
			}else if (!devam.equalsIgnoreCase("hayır")) {
				System.out.println("Geçersiz giriş! 'Evet' veya 'Hayır' yazınız. ");
				System.out.print("\nBitti mi? (Evet/Hayır): ");
				devam= scanner.nextLine();
				bittiMi = false;
			
			}
	
		
		}
		 System.out.println("\nGirilen Değerler:");
	        for (String giris : girisler) {
	            System.out.println(giris);
	        }
		
	 System.out.println("\n--------------------------------------------------------------------");
		
		
		
		
		

	}

}
