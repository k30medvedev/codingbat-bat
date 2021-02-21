package warmup1;

public class CountXX {
    int countXX(String str) {

        if(str.contains("xxxxx"))return 4;
        if(str.contains("xxxx"))return 3;
        if(str.contains("xxx"))return 2;
        if(str.contains("xx"))return 1;
        else return 0;
        //       if (str.matches("(.*)xx(.*)"))
//           return 1;
//       else if (str.matches("(.*)xxx(.*)")) | str.matches("xxx(.*)"))
//
//           return 2;
//    else if (str.matches("(.*)xxxx(.*)"))
//            return 3;
//       else if (str.matches("(.*)xxxxx(.*)"))
//           return 4;
//       else return 0;
    }

}
