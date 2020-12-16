import java.util.Stack;
public class EvaluateStringw {
 public static int evaluate(String expression)
 { 
  char[] take = expression.toCharArray();
  Stack<Integer> value = new Stack<Integer>();
  Stack<Character> ope = new Stack<Character>();
  for (int i = 0; i < take.length; i++)
  {
   if (take[i] == ' ')
    continue;
   if (take[i] >= '0' && take[i] <= '9')
   { 
    StringBuffer stbf = new StringBuffer();
    while (i < take.length && take[i] >= '0' && take[i] <= '9')
     stbf.append(take[i++]);
    value.push(Integer.parseInt(stbf.toString()));
   }
   else if (take[i] == '(')
    ope.push(take[i]);
   else if (take[i] == ')')
   { 
    while (ope.peek() != '(')
    value.push(useOpe(ope.pop(), value.pop(), value.pop()));
    ope.pop();
   }
   else if (take[i] == '+' || take[i] == '-' || take[i] == '*' || take[i] == '/')
   {
    while (!ope.empty() && priority(take[i], ope.peek()))
    value.push(useOpe(ope.pop(), value.pop(), value.pop()));
    ope.push(take[i]);
   } 
  }
  while (!ope.empty())
   value.push(useOpe(ope.pop(), value.pop(), value.pop()));
  return value.pop();
 }
 public static boolean priority(char opa, char opb)
 { 
  if (opa == '(' || opb == ')')
   return false; 
  if ((opa == '*' || opa == '/') && (opb == '+' || opb == '-'))
   return false; 
  else
   return true; 
 }
 public static int useOpe(char op, int b, int a)
 { 
  switch (op) 
  { 
  case '+': 
   return a + b; 
  case '-': 
   return a - b; 
  case '*': 
   return a * b; 
  case '/': 
   if (b == 0) 
    throw new
    UnsupportedOperationException("Cannot divide by zero"); 
   return a / b; 
  } 
  return 0; 
 }
 public static void main(String[] args) 
 {
  System.out.println(EvaluateStringw.evaluate("8 + 2 * 3 - 6 / 2"));

 } 
}