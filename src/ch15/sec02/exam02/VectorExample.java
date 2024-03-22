package ch15.sec02.exam02;

import java.util.*;

import ch15.sec02.exam01.Board;

public class VectorExample {

	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<>(); 
		//ArrayList는 synchronized 처리가 안되어 있어서 갯수가 2000이 안됨
		//Vector로 할경우 synchronized 처리가 되어 있어 갯수가 2000개 나옴

		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board(i, "제목", "내용", "글쓴이", new Date()));
				}
			}

		};

		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board(i, "제목", "내용", "글쓴이", new Date()));
				}
			}

		};

		threadA.start();
		threadB.start();

		// main 스레드를 threadA와 threadB가 종료될때가지 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}
		int size = list.size();
		System.out.println("총 객체의 수 : " + size);
	}

}
