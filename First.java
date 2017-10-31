import java.util.*;
//This is just uses the normal string
class First {
		public static void main(String[] args){
			ArrayList<String> arraylist = new ArrayList<String>();
			String str1 = "This";
			String str2 = "is";
			String str3 = "my";
			String str4 = "unit";
			String str5 = "test";
			String str6 = "submission.";
			arraylist.add(str1);
			arraylist.add(str2); 
			arraylist.add(str3);
			arraylist.add(str4);
			arraylist.add(str5);
			arraylist.add(str6);
			String print1= new String(replaceBracket(arraylist.toString()));
			String print2= new String(replaceComma(print1));
			System.out.println(print2);

		}
		
		private static String replaceBracket (String string){
			return string.replace("[", "").replace("]", "");
		}
		private static String replaceComma (String string){
			return string.replace(",", "").replace(",", "");
		}

} 