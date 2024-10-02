package Task_25thSept;

public class Vowelcounter {
    public static void main(String[] args){
String name="Pratiksha@1";
int vowelcounter=0;
int consonentcounter=0;
for(int i=0;i<name.length();i++){
    char vowel=name.charAt(i);
    if(vowel=='a' || vowel=='e' || vowel=='i'|| vowel=='o'|| vowel=='u'|| vowel=='A'|| vowel=='E' || vowel=='I'|| vowel=='O' || vowel=='U'){
        vowelcounter++;
    }
    else if(vowel>='a' && vowel<='z' || vowel>='A' && vowel<='Z'){
        consonentcounter++;
    }
    else{
        System.out.println("Invalid character" +vowel);
    }
}
System.out.println("number of vowels in a string are:"+vowelcounter);
System.out.println("number of consonents in a string are:"+consonentcounter);
    }
}
