public class ExceptionHandling {
        public static void main(String[] args) {
            String str = null;
            try {
                str.length();
            } catch (NullPointerException e) {
                // TODO: handle exception
                System.out.println("エラーが発生しました: " + e.getMessage());
            }
            
            
    }
}