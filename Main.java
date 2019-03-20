package com.company;

// BarChart dikey grafik çizimi
//20.03.2019


public class Main {

    public static void main(String[] args) {
	    int notlar[] ={45,98,45,97,75,35,80,87,16,31,32,32,32,33,99,87,76,4,2,11,4,55,33};
	    int frekans[]= new int[notlar.length];


		for(int i=0 ; i<notlar.length; i++){
	        frekans[notlar[i]/10]++;

        }
	    /*for(int i = 0 ; i<frekans.length;i++){
	        System.out.println(frekans[i]);

        }*/
	    int enBuyuk = frekans[0];

	    for(int i =0; i<frekans.length;i++){
    		if(frekans[i] > enBuyuk){
    			enBuyuk = frekans[i];
			}}
    	for(int i = 0 ; i<frekans.length ; i++){

    		for(int j =0 ; j<frekans.length; j++){
    			if(enBuyuk==0){
    				break;
				}
    				if(frekans[j]>=enBuyuk) {
						System.out.print("*");
						frekans[j]--;
					}
					System.out.print("    \t");
					}
			enBuyuk--;

    		if(enBuyuk==0){
    			break;
			}

			System.out.println();
				}
    	System.out.println();

		for(int i=0 ; i<10;i++){
			if(i*10+9==99){
				System.out.printf("%2s-%s",i*10,i*10+9);
			}
				else
					System.out.printf("%s-%s   ",i*10,i*10+9);

		}
    		}
		}

