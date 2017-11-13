package GraphVizTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class testcase0 {

	@Test
	public void test() throws IOException {
		gra a=MainFrame.createDirectedGraph("D:\\jave code\\code-1.1\\src\\test.txt");	
		System.out.println(gra.randomWalk2(a, 0));	
		System.out.println(gra.randomWalk2(a, 9));	
		System.out.println(gra.randomWalk2(a, 8));	
	}
}
