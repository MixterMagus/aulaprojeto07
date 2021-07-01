package one.digitalinnovation.aulaprojeto07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aulaprojeto07Application {

	public static void main(String[] args) {
		SpringApplication.run(Aulaprojeto07Application.class, args);
		//Working with Arrays
		int[] arrayOne = {1,2,3};
		int[] arrayTwo = new int[3];

		for(int i=0;i<3;i++){
			arrayTwo[i]=i+1;
		}

		boolean trueOrFalse = arrayOne.equals(arrayTwo);
		System.out.println(trueOrFalse);

		System.out.println("__________________");
		
		System.out.println("arrayOne:");
		for(int i:arrayOne){
			System.out.println(i);
		}

		System.out.println("__________________");

		System.out.println("arrayTwo:");
		for(int i:arrayTwo){
			System.out.println(i);
		}

	}




}
