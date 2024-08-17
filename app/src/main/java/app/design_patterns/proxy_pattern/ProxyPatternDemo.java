package app.design_patterns.proxy_pattern;

class ProxyPatternDemo {

   public static void main(String[] args) {

      Image image = new ProxyImage("PokemonImage.jpg");

      //image will be loaded from disk
      image.display();
      System.out.println("");


      //image will not be loaded from disk
      image.display();

   }


}
