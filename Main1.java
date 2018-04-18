import java.awt.Color;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner keyboard = new Scanner(System.in);

		int counter = 1, num=100, counter2=1;
		
			
		ImageUtils util = new ImageUtils();
		Color[][] news = util.loadImage("src/LennaCV.png");
		Color[][] myNewImage = processNew(news);

		System.out.println("What color would you like to change picture to red, green, or blue?");
		String quad1 = keyboard.next();
		
		if (quad1.equalsIgnoreCase("red")) {
			System.out.println("**Please wait while your picture is loading**\n\n");
			while (counter2<20) {
				util.addImage(process(news,counter),"tab");
				util.display();
				counter2++;
				Thread.sleep(300);
				util.removeTabs();
				counter=counter+30;
				}
			counter=0;
			System.out.println("**Your color is now being changed**");
			while (counter<10) {
				util.addImage( myNewImage, "tab");
				util.display();
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processRed(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processGreen(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processBlue(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				counter ++;
				num= num-10;
				
			}
			util.addImage(processRed(news), "tab");	
		}
		
		else if (quad1.equalsIgnoreCase("green")) {
			
			System.out.println("**Please wait while your picture is loading**\n\n");
			
			while (counter2<20) {
				util.addImage(process(news,counter),"tab");
				util.display();
				counter2++;
				Thread.sleep(300);
				util.removeTabs();
				counter=counter+30;
				}
			counter=0;
			
			System.out.println("**Your color is now being changed**");
			
			while (counter<10) {
				util.addImage( myNewImage, "tab");
				util.display();
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processRed(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processGreen(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processBlue(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				counter ++;
				num= num-10;
				
			}
			util.addImage(processGreen(news), "tab");		
			
			
		}
		else if (quad1.equalsIgnoreCase("blue")) {
			
			System.out.println("**Please wait while your picture is loading**\n\n");
			
			while (counter2<20) {
				util.addImage(process(news,counter),"tab");
				util.display();
				counter2++;
				Thread.sleep(300);
				util.removeTabs();
				counter=counter+30;
				}
			counter=0;
			
			System.out.println("**Your color is now being changed**");
			
			while (counter<10) {
				util.addImage( myNewImage, "tab");
				util.display();
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processRed(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processGreen(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				util.addImage(processBlue(news), "tab");
				Thread.sleep(3*num);
				util.removeTabs();
				counter ++;
				num= num-10;
				
			}
			util.addImage(processBlue(news), "tab");	
			counter=0;
		} 
		
			
	}


	
	
	public static Color[][] process(Color[][] img, int a){
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i =0; i < tmp.length; i++) {
			for (int j=0; j< tmp[i].length; j++) {
				if (j<tmp.length-a) {
					// Red, Green, Blue : 0-250
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					int h = pixel.getTransparency();
					
					tmp[i][j] = new Color(0,0,0);
}
					
				
	    		if (i<tmp.length-a) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed(); 
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					int h = pixel.getTransparency();
					tmp[i][j] = new Color(0,0,0);
				
				
			}

		}
	
		}
	
		return tmp;
}
	public static Color[][] processBlue(Color[][] img){
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i =0; i < tmp.length; i++) {
			for (int j=0; j< tmp[i].length; j++) {
				if (i<tmp.length) {
					Color pixel = tmp[i][j];
					int h = pixel.getTransparency();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(h,h,b);

			}
		
			}
	
		}
		return tmp;
}
		
	public static Color[][] processGreen(Color[][] img){
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i =0; i < tmp.length; i++) {
			for (int j=0; j< tmp[i].length; j++) {
				if (i<tmp.length) {
					Color pixel = tmp[i][j];
					int h = pixel.getTransparency();
					int g = pixel.getGreen();
					tmp[i][j] = new Color(h,g,h);

			}
		}
	
	
	}
		return tmp;
}
	public static Color[][] processRed(Color[][] img){
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i =0; i < tmp.length; i++) {
			for (int j=0; j< tmp[i].length; j++) {
				if (i<tmp.length) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int h = pixel.getTransparency();
					tmp[i][j] = new Color(r,h,h);
					

			}
		}
	
	
	}
		return tmp;
}
	
public static Color[][] processNew(Color[][] img){
	Color[][] tmp = ImageUtils.cloneArray(img);
	
	for (int i =0; i < tmp.length; i++) {
		for (int j=0; j< tmp[i].length; j++) {
			if (i<tmp.length) {
				Color pixel = tmp[i][j];
				int r = pixel.getRed(); 
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				int h = pixel.getTransparency();
				tmp[i][j] = new Color(r,g,b);
				

		}
	}


}
	return tmp;
}

public static Color[][] processNew2(Color[][] img){
	Color[][] tmp = ImageUtils.cloneArray(img);
	
	for (int i =0; i < tmp.length; i++) {
		for (int j=0; j< tmp[i].length; j++) {
			if (i<tmp.length) {
				Color pixel = tmp[i][j];
				int r = pixel.getRed(); 
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				int h = pixel.getTransparency();
				tmp[i][j] = new Color(r,h,h);
				

		}
	}


}
	return tmp;
}

}
