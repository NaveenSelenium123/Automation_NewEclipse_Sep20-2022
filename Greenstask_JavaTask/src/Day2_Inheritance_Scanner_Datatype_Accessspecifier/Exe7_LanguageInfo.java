package Day2_Inheritance_Scanner_Datatype_Accessspecifier;

public class Exe7_LanguageInfo extends Exe7_StateDetails{
	public void tamilLanguage() {
	System.out.println("Tamillanguage");

}

	public void englishLanguage() {
	System.out.println("EnglishLangaue");
}

	public void hindiLanguage() {
	
System.out.println("HindiLanguage");
}
	public static void main(String[] args) {
		Exe7_LanguageInfo t =new Exe7_LanguageInfo();
		t.tamilLanguage();
		t.englishLanguage();
		t.hindiLanguage();
		t.southIndia();
		t.northIndia();
	}
}
