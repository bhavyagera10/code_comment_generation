package methodEmbedding.Counting_Sheep.S.LYD436;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EN2016QA {
	public static void main(String[] args) {
		File inputFile = new File("c:/tmp/A-small-attempt0.in");
		File outputFile = new File("c:/tmp/A-small-attempt0.out");
		FileReader filereader = null;
		BufferedReader br = null;
		FileWriter filewriter = null;
		BufferedWriter bw = null;

		try {
			// ??????
			filereader = new FileReader(inputFile);
			br = new BufferedReader(filereader);

			// ??????
			filewriter = new FileWriter(outputFile);
			bw = new BufferedWriter(filewriter);

			/**************************************************************************************
			// ????????????????????????????????????
			 **************************************************************************************/
			int T;

			// ???????????????????????????
			String lineStr = br.readLine();
			T = Integer.parseInt(lineStr);
			System.out.println("T = " + T + "\n");

			/**************************************************************************************
			// Case???1???????????????
			 **************************************************************************************/
			long caseIndex = 1;
			for(int t=0; t < T; t++) {
				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				// ??????
				int caseAnser = -1;

				lineStr = br.readLine();
				int N = Integer.parseInt(lineStr);

				System.out.println("N = " + N);

				if(N != 0){
					// 2?????????bit??????????????????????????????????????????n+1?????????n??????????????????????????????1?????????bit?????????????????????0???????????????????????????
					// 0b1111111111 ??? 1023
					int check = 0;

					System.out.println(Integer.toBinaryString(check));
					for(int i=1;check != 1023 ;i++){
						int number = N * i;
						caseAnser = number;  // ???????????????????????????????????????????????????????????????????????????????????????????????????
						System.out.println("caseAnser = " + caseAnser);

						while(number != 0){
//							System.out.println("number = " + number);

							// 1???????????????????????????
							check = check | (0x01 << (number % 10));
//							System.out.println(Integer.toBinaryString(check));
//							System.out.println(check);

							if(check == 1023){
								break;
							}
							// ??????????????????
							number = number / 10;
						}
					}
				}

				String caseAnserStr;

				if(caseAnser == -1){
					caseAnserStr = "INSOMNIA";
				} else {
					caseAnserStr = "" + caseAnser;
				}

				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				String output = "Case #" + caseIndex + ": " + caseAnserStr;
				caseIndex++;
				System.out.println(output);
				bw.write(output);
				bw.newLine();
				bw.flush();

				/**************************************************************************************
				// ??????Case???????????????
				 **************************************************************************************/
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filereader != null) {
					filereader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filewriter != null) {
					filewriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
