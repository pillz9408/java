package project_1;

import java.util.Scanner;

public class Arrays_09 {

	public static void main(String[] args) {
		//201p ex06
		
		boolean run = true;
		int stNum = 0;
		int[] Scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.학생 수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("-----------------------------------------------------------------");
		    System.out.print("선택> ");
		    
		    int selectNo = Integer.parseInt(sc.nextLine());
		    
		    if(selectNo == 1) {
		    	System.out.print("학생수> ");
		    	stNum = Integer.parseInt(sc.nextLine());
		    	Scores = new int[stNum];
		    }else if(selectNo == 2) {
		     for (int i=0; i< Scores.length; i++) {
		    	 System.out.print("Scores["+i+"]> ");
		    	 Scores[i] = Integer.parseInt(sc.nextLine());
		     }
		    } else if(selectNo == 3) {
		    	for(int i=0; i<stNum; i++) {
		    		System.out.println("Scores["+i+"]" +Scores[i]);
		    	}
		    }else if(selectNo ==4) {
		    		int max =0;
		    		int sum =0;
		    		double avg = 0.0;
		    		for(int i=0; i<Scores.length; i++) {
		    			max = (max < Scores[i]) ? Scores[i] : max; // 삼항연산자
		    			sum += Scores[i];
		            }
		    		avg = (double) sum / stNum;
		    		System.out.println("최고점수: " + max);
		    		System.out.println("평균점수: " + avg);
		    		}else if(selectNo == 5) {
		    			run = false;
		    		}
		            }
		
		System.out.println("프로그램 종료");
		    
		}
		

	}
