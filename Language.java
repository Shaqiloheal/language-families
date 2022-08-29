// Parent class Language
class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    //Constructors
    Language(String langName, int speakers, String regions, String wdOrder) {
      this.name = langName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = wdOrder;
  
    }
  
    //public method
    public void getInfo() {
  
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
  
    }
  
    //main
    public static void main(String[] args) {
  
      /*
      Language english = new Language("English", 1350000000, "United Kingdom, United States of America, Canada, Australia and New Zealand", "subject-verb-object");
      english.getInfo();
      */
      /*
      Mayan tzeltal = new Mayan("Tzeltal", 445856);
      tzeltal.getInfo();
      */
      SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 1200000000);
      SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
      chinese.getInfo();
      burmese.getInfo();
  
    }
  
  }