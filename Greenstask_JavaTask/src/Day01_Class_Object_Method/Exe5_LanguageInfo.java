package Day01_Class_Object_Method;
public class Exe5_LanguageInfo extends Exe5_StateDetails{
private void tamilLanguage() {
	System.out.println("Tamil");
}

private void englishLanguage() {
System.out.println("English");	
}
private void hindiLanguage() {
	System.out.println("Hindi");
}
public static void main(String[] args) {
	Exe5_LanguageInfo v =new Exe5_LanguageInfo();
	v.tamilLanguage();
	v.englishLanguage();
	v.hindiLanguage();
	v.southIndia();
	v.northIndia();	
}
}
