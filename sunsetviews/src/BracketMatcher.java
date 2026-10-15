import java.util.Stack;

public class BracketMatcher {

   // this small nested class (lines 7 - 25) can help you solve the problem.
   // (if you feel it doesn't, feel free to delete it.)
   private static class Bracket {
      char bracketType;
      int bracketPosition;

      Bracket(char type, int position) {
         bracketType = type;
         bracketPosition = position;
      }

      boolean matches(char c) {
         if (bracketType == '[' && c == ']')
            return true;
         if (bracketType == '{' && c == '}')
            return true;
         if (bracketType == '(' && c == ')')
            return true;
         return false;
      }
   }

   public static void main(String[] args) {
      In in = new In("test04.txt");
      String text = in.readLine();
      System.out.println("processing: " + text); // comment out or delete this line before submitting
      
      Boolean correct = true; //Referenced later to say if correct print success else do nothing


      Stack<Bracket> openingBrackets = new Stack<>();
      
      for (int position = 1; position <= text.length(); ++position) {
         char next = text.charAt(position - 1);
         /* YOUR CODE HERE */
         //Pushes to stack if the char is an opening bracket
         if(next == '(' || next == '{' || next == '[') openingBrackets.push(new Bracket(next, position));
         //Check if closing bracket
         else if(next == ')' || next == ']' || next == '}' ){
            //if the first bracket is  a closing bracket print the position ex: 123}56 ==> "4"
            if(openingBrackets.isEmpty()){
               System.out.println(position);
               correct = false; 
            }

            /*    
            //    Otherwise determine if the bracket on the top of the stack matches the character
            //    true or false(additionally prints the position of the char) 
            */
            if(openingBrackets.peek().matches(next)){
               openingBrackets.pop();
            } else {
               System.out.println(position); 
               return;
            }
         }
      }


      // Print "Success" if brackets are balanced -> correct = true
      
      if(correct){
         System.out.println("Success");   
      }

   }
}

