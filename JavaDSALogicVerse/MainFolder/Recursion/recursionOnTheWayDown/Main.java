import java.util.*;
public class Main{
  //1.
// get subsequences of a String

public static ArrayList<String> getSubSequences(String str){
  // base condition
if(str.length() == 0){
  ArrayList<String> bans = new ArrayList<>();
  bans.add("");
  return bans;
}
//whole work/ans -> 3
  char firstChar = str.charAt(0);
//smaller ans -> 1
  String smallerString = str.substring(1);
  ArrayList<String> smallerAns = getSubSequences(smallerString);
// ans for store whole problem ->2
  ArrayList<String> ans = new ArrayList<>();
  
//first character said no
  for(String sub: smallerAns){
    ans.add(sub);
  }
//first character said yes
  for(String sub: smallerAns){
    ans.add(firstChar + sub);
  }
return ans;
 }
//2.
//get keypad combination

static String[] keys = {";#,","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
public static ArrayList<String> getKPC(String str){
  //base condition
  if(str.length() == 0){
    ArrayList<String> bans = new ArrayList<String>();
    bans.add("");
    return bans;
  }
  //get lost value
  char firstChar = str.charAt(0);
  //smaller ans
  String smallerString = str.substring(1);
  ArrayList<String> smallerAns = getKPC(smallerString);
  //ans
  ArrayList<String> ans = new ArrayList<>();
  //particular number, particular key ->
  int firstNum = firstChar - '0';
  String key = keys[firstNum];

  //for taking loop till it end value
  for(int i=0;i<key.length();i++){
    char keyChar = key.charAt(i);
  //get full ans work in for each loop
  for(String sans: smallerAns){
    ans.add(keyChar + sans);
  }
}
  return ans;
}
//3.
//get stair paths

public static ArrayList<String> getStairPaths(int totalStair){
  //base condition
  if(totalStair<0){
    ArrayList<String> bans = new ArrayList<>();
    return bans;
  }

  if(totalStair == 0){
    ArrayList<String> bans = new ArrayList<>();
    bans.add("");
    return bans;
  }

  //smaller ans
  ArrayList<String> oneStepPaths =  getStairPaths(totalStair-1);
  ArrayList<String> twoStepPaths = getStairPaths(totalStair-2);
  ArrayList<String> threeStepPaths = getStairPaths(totalStair-3);

  //ans
  ArrayList<String> ans = new ArrayList<>();

  //whole work

  //path after taking first step
  for(String path: oneStepPaths){
    ans.add("1" + path);
  }

  //path after taking two step
  for(String path: twoStepPaths){
    ans.add("2" + path);
  }

  //path after taking three step
  for(String path: threeStepPaths){
    ans.add("3" + path);
  }

  return ans;
}
//4.
//get maze path -> simple

//a.
public static void getMazePathsSimply(int sr, int sc, int dr, int dc,String psf){

  //base condition
  if(sr>dr || sc>dc){
    return;
  }

  if(sr == dr && sc == dc){
    System.out.print(psf + ", ");
    return;
  }
  //smaller problem
  
  getMazePathsSimply(sr,sc+1,dr,dc,"h");
  getMazePathsSimply(sr+1,sc,dr,dc,"v");
}
//short form
//sr -> source row
//sc -> source col
//dr -> destination row
//dc -> destination col
//psf -> path so far
//get maze path -> arraylist

//b.
public static ArrayList<String> getMazePaths(int sr,int sc, int dr, int dc){
  //base condition
  if(sr>dr || sc>dc){
    ArrayList<String> bans = new ArrayList<>();
    return bans;
  }
  
  if(sr == dr && sc == dc){
    ArrayList<String> bans = new ArrayList<>();
    bans.add("");
    return bans;
  }

  //smallerAns
  ArrayList<String> pathAfterHStep = getMazePaths(sr,sc+1,dr,dc);
  ArrayList<String> pathAfterVStep = getMazePaths(sr+1,sc,dr,dc);

  //ans
  ArrayList<String> ans = new ArrayList<>();

  //whole work
  for(String path: pathAfterHStep){
    ans.add("h" + path);
  }

  for(String path: pathAfterVStep){
    ans.add("v" + path);
  }
  return ans;
}

//c.
public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc){

  // base condition
  if(sr == dr && sc == dc){
    ArrayList<String> bans = new ArrayList<>();
    bans.add("");
    return bans;
  }

  // ans
  ArrayList<String> ans = new ArrayList<>();

  // smallerAns
  // horizontal jumps
  for(int jump=1;jump<=dc-sc;jump++){
    ArrayList<String> pathsAfterHJumps = getMazePathsWithJumps(sr,sc+jump,dr,dc);
    

      for(String HPaths: pathsAfterHJumps){
        ans.add("h" +jump+HPaths);
      }
    }

  // vertical jumps
  for(int jump=1;jump<=dr-sr;jump++){
    ArrayList<String> pathsAfterVJumps = getMazePathsWithJumps(sr+jump,sc,dr,dc);
      
      for(String VPaths: pathsAfterVJumps){
        ans.add("v"+jump+VPaths);
      }
  }
  return ans;
}
  public static void main(String[] args){
  // user given
  //1 -> get subsequences of a String
    Scanner scn = new Scanner(System.in);
    // String str = scn.next();
    // ArrayList<String> ans = getSubSequences(str);
    // System.out.println(ans);

  // hard code

  //1 -> get subsequences of a string
    // ArrayList<String> ans = getSubSequences("abc");
    // System.out.println(ans);

  //2 -> get keypad combination
  // ArrayList<String> ans = getKPC("789");
  // System.out.println(ans);

  //3 -> get stairs path
  // ArrayList<String> ans = getStairPaths(3);
  // System.out.println(ans);
    scn.close();

  //4 -> get maze path
  //a.
  //getMazePathsSimply(0,0,2,2,"");
  //b.
  // ArrayList<String> ans = getMazePaths(0,0,2,2);
  // System.out.println(ans);
  //c.
  ArrayList<String> ans = getMazePathsWithJumps(0,0,2,2);
  System.out.println(ans);
}
}
// <--------------------------------Recursion on the Way Down ---------------------------------->