package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

import utility.XLUtils;

public class RobotLettersEntryFunction {

	public static void switchCase(String str) throws AWTException, InterruptedException 

	{
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch (ch) {
			case 'A':
				Robot rob1 = new Robot();
				rob1.keyPress(KeyEvent.VK_A);
				rob1.keyRelease(KeyEvent.VK_A);
				Thread.sleep(2000);
				break;
			case 'B':
				Robot rob2 = new Robot();
				rob2.keyPress(KeyEvent.VK_B);
				rob2.keyRelease(KeyEvent.VK_B);
				Thread.sleep(2000);
				break;
			case 'C':
				Robot rob3 = new Robot();
				rob3.keyPress(KeyEvent.VK_C);
				rob3.keyRelease(KeyEvent.VK_C);
				Thread.sleep(2000);
				break;
			case 'D':
				Robot rob4 = new Robot();
				rob4.keyPress(KeyEvent.VK_D);
				rob4.keyRelease(KeyEvent.VK_D);
				Thread.sleep(2000);
				break;
			case 'E':
				Robot rob5 = new Robot();
				rob5.keyPress(KeyEvent.VK_E);
				rob5.keyRelease(KeyEvent.VK_E);
				Thread.sleep(2000);
				break;
			case 'F':
				Robot rob6 = new Robot();
				rob6.keyPress(KeyEvent.VK_F);
				rob6.keyRelease(KeyEvent.VK_F);
				Thread.sleep(2000);
				break;
			case 'G':
				Robot rob7 = new Robot();
				rob7.keyPress(KeyEvent.VK_G);
				rob7.keyRelease(KeyEvent.VK_G);
				Thread.sleep(2000);
				break;
			case 'H':
				Robot rob8 = new Robot();
				rob8.keyPress(KeyEvent.VK_H);
				rob8.keyRelease(KeyEvent.VK_H);
				Thread.sleep(2000);
				break;
			case 'I':
				Robot rob9 = new Robot();	
				rob9.keyPress(KeyEvent.VK_I);
				rob9.keyRelease(KeyEvent.VK_I);		
				Thread.sleep(2000);
				break;
			case 'J':
				Robot rob10 = new Robot();
				rob10.keyPress(KeyEvent.VK_J);
				rob10.keyRelease(KeyEvent.VK_J);
				Thread.sleep(2000);
				break;
			case 'K':
				Robot rob11 = new Robot();
				rob11.keyPress(KeyEvent.VK_K);
				rob11.keyRelease(KeyEvent.VK_K);
				Thread.sleep(2000);
				break;
			case 'L':
				Robot rob12 = new Robot();
				rob12.keyPress(KeyEvent.VK_L);
				rob12.keyRelease(KeyEvent.VK_L);
				Thread.sleep(2000);
				break;
			case 'M':
				Robot rob13 = new Robot();
				rob13.keyPress(KeyEvent.VK_M);
				rob13.keyRelease(KeyEvent.VK_M);
				Thread.sleep(2000);
				break;
			case 'N':
				Robot rob14 = new Robot();
				rob14.keyPress(KeyEvent.VK_N);
				rob14.keyRelease(KeyEvent.VK_N);
				Thread.sleep(2000);
				break;
			case 'O':
				Robot rob15 = new Robot();
				rob15.keyPress(KeyEvent.VK_O);
				rob15.keyRelease(KeyEvent.VK_O);
				Thread.sleep(2000);
				break;
			case 'P':
				Robot rob16 = new Robot();
				rob16.keyPress(KeyEvent.VK_P);
				rob16.keyRelease(KeyEvent.VK_P);
				Thread.sleep(2000);
				break;
			case 'Q':
				Robot rob17 = new Robot();
				rob17.keyPress(KeyEvent.VK_Q);
				rob17.keyRelease(KeyEvent.VK_Q);
				Thread.sleep(2000);
				break;
			case 'R':
				Robot rob18 = new Robot();
				rob18.keyPress(KeyEvent.VK_R);
				rob18.keyRelease(KeyEvent.VK_R);
				Thread.sleep(2000);
				break;
			case 'S':
				Robot rob19 = new Robot();
				rob19.keyPress(KeyEvent.VK_S);
				rob19.keyRelease(KeyEvent.VK_S);
				Thread.sleep(2000);
				break;
			case 'T':
				Robot rob20 = new Robot();
				rob20.keyPress(KeyEvent.VK_T);
				rob20.keyRelease(KeyEvent.VK_T);
				Thread.sleep(2000);
				break;
			case 'U':
				Robot rob21 = new Robot();
				rob21.keyPress(KeyEvent.VK_U);
				rob21.keyRelease(KeyEvent.VK_U);
				Thread.sleep(2000);
				break;
			case 'V':
				Robot rob22 = new Robot();
				rob22.keyPress(KeyEvent.VK_V);
				rob22.keyRelease(KeyEvent.VK_V);
				Thread.sleep(2000);
				break;
			case 'W':
				Robot rob23 = new Robot();
				rob23.keyPress(KeyEvent.VK_W);
				rob23.keyRelease(KeyEvent.VK_W);
				Thread.sleep(2000);
				break;
			case 'X':
				Robot rob24 = new Robot();
				rob24.keyPress(KeyEvent.VK_X);
				rob24.keyRelease(KeyEvent.VK_X);
				Thread.sleep(2000);
				break;
			case 'Y':
				Robot rob25 = new Robot();
				rob25.keyPress(KeyEvent.VK_Y);
				rob25.keyRelease(KeyEvent.VK_Y);
				Thread.sleep(2000);
				break;
			case 'Z':
				Robot rob26 = new Robot();
				rob26.keyPress(KeyEvent.VK_Z);
				rob26.keyRelease(KeyEvent.VK_Z);
				Thread.sleep(2000);
				break;
			case '0':
				Robot rob27 = new Robot();
				rob27.keyPress(KeyEvent.VK_0);
				rob27.keyRelease(KeyEvent.VK_0);
				//Thread.sleep(1000);
				break;
			case '1':
				Robot rob28 = new Robot();
				rob28.keyPress(KeyEvent.VK_1);
				rob28.keyRelease(KeyEvent.VK_1);
				//Thread.sleep(1000);
				break;
			case '2':
				Robot rob29 = new Robot();
				rob29.keyPress(KeyEvent.VK_2);
				rob29.keyRelease(KeyEvent.VK_2);
				//Thread.sleep(1000);
				break;
			case '3':
				Robot rob30 = new Robot();
				rob30.keyPress(KeyEvent.VK_3);
				rob30.keyRelease(KeyEvent.VK_3);
				//Thread.sleep(1000);
				break;
			case '4':
				Robot rob31 = new Robot();
				rob31.keyPress(KeyEvent.VK_4);
				rob31.keyRelease(KeyEvent.VK_4);
				//Thread.sleep(1000);
				break;
			case '5':
				Robot rob32 = new Robot();
				rob32.keyPress(KeyEvent.VK_5);
				rob32.keyRelease(KeyEvent.VK_5);
				//Thread.sleep(1000);
				break;
			case '6':
				Robot rob33 = new Robot();
				rob33.keyPress(KeyEvent.VK_6);
				rob33.keyRelease(KeyEvent.VK_6);
				//Thread.sleep(1000);
				break;
			case '7':
				Robot rob34 = new Robot();
				rob34.keyPress(KeyEvent.VK_7);
				rob34.keyRelease(KeyEvent.VK_7);
				//Thread.sleep(1000);
				break;
			case '8':
				Robot rob35 = new Robot();
				rob35.keyPress(KeyEvent.VK_8);
				rob35.keyRelease(KeyEvent.VK_8);
				//Thread.sleep(1000);
				break;
			case '9':
				Robot rob36 = new Robot();
				rob36.keyPress(KeyEvent.VK_9);
				rob36.keyRelease(KeyEvent.VK_9);
				//Thread.sleep(1000);
				break;
			case '*':
				Robot rob37 = new Robot();
				rob37.keyPress(KeyEvent.VK_SHIFT);
				rob37.keyPress(KeyEvent.VK_8);
				rob37.keyRelease(KeyEvent.VK_SHIFT);
				rob37.keyRelease(KeyEvent.VK_8);
				Thread.sleep(1000);
				break;
			case '.':
				Robot rob38 = new Robot();
				rob38.keyPress(KeyEvent.VK_PERIOD);
				rob38.keyRelease(KeyEvent.VK_PERIOD);
				//Thread.sleep(1000);
				break;
			case '(':
				Robot rob39 = new Robot();
				rob39.keyPress(KeyEvent.VK_SHIFT);
				rob39.keyPress(KeyEvent.VK_9);
				rob39.keyRelease(KeyEvent.VK_SHIFT);
				rob39.keyRelease(KeyEvent.VK_9);
				Thread.sleep(1000);
				break;
			case ')':
				Robot rob40 = new Robot();
				rob40.keyPress(KeyEvent.VK_SHIFT);
				rob40.keyPress(KeyEvent.VK_0);
				rob40.keyRelease(KeyEvent.VK_SHIFT);
				rob40.keyRelease(KeyEvent.VK_0);
				Thread.sleep(1000);
				break;
			case '#':
				Robot rob41 = new Robot();
				rob41.keyPress(KeyEvent.VK_SHIFT);
				rob41.keyPress(KeyEvent.VK_3);
				rob41.keyRelease(KeyEvent.VK_SHIFT);
				rob41.keyRelease(KeyEvent.VK_3);
				Thread.sleep(1000);
				break;
			case '!':
				Robot rob42 = new Robot();
				rob42.keyPress(KeyEvent.VK_SHIFT);
				rob42.keyPress(KeyEvent.VK_1);
				rob42.keyRelease(KeyEvent.VK_SHIFT);
				rob42.keyRelease(KeyEvent.VK_1);
				Thread.sleep(1000);
				break;
			case '@':
				Robot rob43 = new Robot();
				rob43.keyPress(KeyEvent.VK_SHIFT);
				rob43.keyPress(KeyEvent.VK_2);
				rob43.keyRelease(KeyEvent.VK_SHIFT);
				rob43.keyRelease(KeyEvent.VK_2);
				Thread.sleep(1000);
				break;
			case '$':
				Robot rob44 = new Robot();
				rob44.keyPress(KeyEvent.VK_SHIFT);
				rob44.keyPress(KeyEvent.VK_4);
				rob44.keyRelease(KeyEvent.VK_SHIFT);
				rob44.keyRelease(KeyEvent.VK_4);
				Thread.sleep(1000);
				break;
			case '%':
				Robot rob46 = new Robot();
				rob46.keyPress(KeyEvent.VK_SHIFT);
				rob46.keyPress(KeyEvent.VK_5);
				rob46.keyRelease(KeyEvent.VK_SHIFT);
				rob46.keyRelease(KeyEvent.VK_5);
				Thread.sleep(1000);
				break;
			case '^':
				Robot rob45 = new Robot();
				rob45.keyPress(KeyEvent.VK_SHIFT);
				rob45.keyPress(KeyEvent.VK_6);
				rob45.keyRelease(KeyEvent.VK_SHIFT);
				rob45.keyRelease(KeyEvent.VK_6);
				Thread.sleep(1000);
				break;
			case '&':
				Robot rob01 = new Robot();
				rob01.keyPress(KeyEvent.VK_SHIFT);
				rob01.keyPress(KeyEvent.VK_7);
				rob01.keyRelease(KeyEvent.VK_SHIFT);
				rob01.keyRelease(KeyEvent.VK_7);
				Thread.sleep(1000);
				break;
			case '-':
				Robot rob47 = new Robot();
				rob47.keyPress(KeyEvent.VK_MINUS);
				rob47.keyRelease(KeyEvent.VK_MINUS);
				Thread.sleep(1000);
				break;
			case '_':
				Robot rob48 = new Robot();
				rob48.keyPress(KeyEvent.VK_SHIFT);
				rob48.keyPress(KeyEvent.VK_MINUS);
				rob48.keyRelease(KeyEvent.VK_SHIFT);
				rob48.keyRelease(KeyEvent.VK_MINUS);
				Thread.sleep(1000);
				break;
			case '+':
				Robot rob49 = new Robot();
				rob49.keyPress(KeyEvent.VK_SHIFT);
				rob49.keyPress(KeyEvent.VK_EQUALS);
				rob49.keyRelease(KeyEvent.VK_SHIFT);
				rob49.keyRelease(KeyEvent.VK_EQUALS);
				Thread.sleep(1000);
				break;
			case '=':
				Robot rob50 = new Robot();
				rob50.keyPress(KeyEvent.VK_EQUALS);
				rob50.keyRelease(KeyEvent.VK_EQUALS);
				Thread.sleep(1000);
				break;
			case '{':
				Robot rob51 = new Robot();
				rob51.keyPress(KeyEvent.VK_SHIFT);
				rob51.keyPress(KeyEvent.VK_OPEN_BRACKET);
				rob51.keyRelease(KeyEvent.VK_SHIFT);
				rob51.keyRelease(KeyEvent.VK_OPEN_BRACKET);
				Thread.sleep(1000);
				break;
			case '}':
				Robot rob52 = new Robot();
				rob52.keyPress(KeyEvent.VK_SHIFT);
				rob52.keyPress(KeyEvent.VK_CLOSE_BRACKET);
				rob52.keyRelease(KeyEvent.VK_SHIFT);
				rob52.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
				Thread.sleep(1000);
				break;
			case '[':
				Robot rob53 = new Robot();
				rob53.keyPress(KeyEvent.VK_OPEN_BRACKET);
				rob53.keyRelease(KeyEvent.VK_OPEN_BRACKET);
				Thread.sleep(1000);
				break;
			case ']':
				Robot rob54 = new Robot();
				rob54.keyPress(KeyEvent.VK_CLOSE_BRACKET);
				rob54.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
				Thread.sleep(1000);
				break;
			case '/':
				Robot rob55 = new Robot();
				rob55.keyPress(KeyEvent.VK_SLASH);
				rob55.keyRelease(KeyEvent.VK_SLASH);
				Thread.sleep(1000);
				break;
			case ':':
				Robot rob56 = new Robot();
				rob56.keyPress(KeyEvent.VK_SHIFT);
				rob56.keyPress(KeyEvent.VK_SEMICOLON);
				rob56.keyRelease(KeyEvent.VK_SHIFT);
				rob56.keyRelease(KeyEvent.VK_SEMICOLON);
				Thread.sleep(1000);
				break;
			case '<':
				Robot rob57 = new Robot();
				rob57.keyPress(KeyEvent.VK_SHIFT);
				rob57.keyPress(KeyEvent.VK_COMMA);
				rob57.keyRelease(KeyEvent.VK_SHIFT);
				rob57.keyRelease(KeyEvent.VK_COMMA);
				Thread.sleep(1000);
				break;
			case '>':
				Robot rob58 = new Robot();
				rob58.keyPress(KeyEvent.VK_SHIFT);
				rob58.keyPress(KeyEvent.VK_PERIOD);
				rob58.keyRelease(KeyEvent.VK_SHIFT);
				rob58.keyRelease(KeyEvent.VK_PERIOD);
				Thread.sleep(1000);
				break;
			case ' ':
				Robot rob59 = new Robot();
			    rob59.keyPress(KeyEvent.VK_SPACE);		
				rob59.keyRelease(KeyEvent.VK_SPACE);
				Thread.sleep(1000);
				break;
				
				
		
			}
		}

	}





}
