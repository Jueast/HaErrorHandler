class HaErrorHandler{
  public static void err(int code){
    String s = null;
    switch(code){
      case 1: s = "你们啊，naive！";break;
      case 2: s = "你们不要想喜欢弄个大bug";break;
    }
    System.out.print(s);
    System.exit(0);
  }
  
}
