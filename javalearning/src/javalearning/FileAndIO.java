package javalearning;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class FileAndIO {

	public static void main(String args[]) {
		try {
			/*
			 * ByteStream Start
			 */
			FileInputStream input= new FileInputStream("input.txt");
			FileOutputStream output= new FileOutputStream("output8byte.txt");
			int byteData;
			while(-1!=(byteData=input.read())) {
				output.write(byteData);
			}
			//because it release the resource which is linked to this stream.
			input.close();
			output.close();
			/*
			 * ByteStream End
			 */
			
			/*
			 * Character Stream Start
			 */
			FileReader fileReader= new FileReader("input.txt");
			FileWriter fileWriter= new FileWriter("output16byte.txt");
			while(-1!=(byteData=fileReader.read())) {
				fileWriter.write(byteData);
			}
			fileReader.close();
			fileWriter.close();
			/*
			 * Character Stream end
			 */
			
			/*
			 * Standard Stream start
			 */
			InputStreamReader inputStreamReader=new InputStreamReader(System.in);
			System.out.println("type animesh to stop");
			char name;
			while('a'!=((name=(char) inputStreamReader.read()))) {
				System.out.println(name);
			}
			/*
			 * Standard Stream End
			 */
			
			
			/*
			 * ByteArrayInputStream and ByteArrayOutputStream start
			 */
			ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream(12);
			while(byteArrayOutputStream.size()<12) {
				byteArrayOutputStream.write("animesh".getBytes());
			}
			byte b[]=byteArrayOutputStream.toByteArray();
			for(byte by:b) {
				System.out.print((char)by);
			}
			System.out.println();
			ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(b);
			while(-1!=(byteData=byteArrayInputStream.read())) {
				System.out.print(Character.toUpperCase((char)byteData));
			}
			System.out.println();
			byteArrayInputStream.reset();
			/*
			 * ByteArrayInputStream and ByteArrayOutputStream End
			 */
			
			/*
			 * BufferedInput and BufferedOutput Stream start
			 */
			FileInputStream fileInputStream2= new FileInputStream("input.txt");
			BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream2);
			//how many character is there in the file
			System.out.println("how many character are there ::"+ bufferedInputStream.available());
			//mark support means that whether the input stream support the mark and reset method
			boolean mark;
			System.out.println("Mark support"+ (mark=bufferedInputStream.markSupported()));
			if(mark) {
				bufferedInputStream.mark(bufferedInputStream.available());
			}
			bufferedInputStream.skip(3);
			int value;
			System.out.println("printing the buffered input stream after the skip");
			while(-1!=(value=bufferedInputStream.read())) {
				System.out.print((char)value);
			}
			//reset it to the marked place if not marked then it will throw the io exception
			bufferedInputStream.reset();
			System.out.println();
			System.out.println("after the reset method is called");
			while(-1!=(value=bufferedInputStream.read())) {
				System.out.print((char)value);
			}
			bufferedInputStream.close();
			FileOutputStream fileOutputStream2= new FileOutputStream("bufferoutput.txt");
			BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream2);
			byte buf[]= {65,66,67,68,69,70,71,72,60,89};
			bufferedOutputStream.write(buf);//this write to buffer
			bufferedOutputStream.flush();//this write to the output stream
			fileOutputStream2.close();
			bufferedOutputStream.close();
			/*
			 * BufferedInput and BufferedOutput Stream end
			 */
			
			/*
			 * BufferedReader and BufferedWriter start
			 * 1.read text from character stream ,provide reading of character,array and lines
			 * 2.it can be of specified size or the default size.default size is enough for all purpose.
			 * 3. every read request made by the reader is corresponding to the read request made of the 
			 * underlying character or byte stream
			 * 4.It is advisable to wrap the buffer reader around any reader whose read is costly
			 * like fileReader and inputStreamReader
			 * 5.program that use the DataInputStream for textual input then we should use buffer reader. 
			 */
			System.out.println();
			System.out.println("------buffer reader and writter-----------");
			FileReader fileReader2= new FileReader("input.txt");
			BufferedReader bufferedReader= new BufferedReader(fileReader2);
			bufferedReader.mark(1);
			bufferedReader.skip(7);
			System.out.println();
			while(-1!=(byteData=bufferedReader.read())) {
				System.out.print((char)byteData);
			}
			System.out.println();
			System.out.println(bufferedReader.readLine());
			System.out.println(bufferedReader.readLine());
			bufferedReader.reset();
			System.out.println(bufferedReader.readLine());
			
			
			/*
			 * BufferedReader and BufferedWriter End
			 */
		}catch(Exception e) {
			
		}
	}
}
