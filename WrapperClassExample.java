package AllProgram;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		byte b=10;				
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		//Auto-Boxing
		Byte byteobj=b;				
		Short shortobj=s;
		//Int intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		//Char charobj= c;
		Boolean boolobj=b2;
		//Printing object:
		System.out.println("-----Printing Object Values-----");
		System.out.println("Byte Object:"+byteobj);
		System.out.println("Short Object:"+shortobj);
		int intobj;
		//System.out.println("Int Object:"+intobj);
		System.out.println("Long Object:"+longobj);
		System.out.println("Float Object:"+floatobj);
		System.out.println("Double Object:"+doubleobj);
		char charobj;
		//System.out.println("Char Object:"+charobj);
		System.out.println("Boolean Object:"+boolobj);
		//UN-BOXING:
		byte bytevalue=byteobj;
		short shortevalue=shortobj;
		//int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		//char cahrvalue=charobj;
		boolean boolvalue=boolobj;
	}

}
