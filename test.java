import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class test {

//static int AscendingOrder(int n){
//    int temp = Integer.MAX_VALUE;
//    int number = n>0?n:n*-1;
//    while(number>0){
//        int num = number%10;
//        if(num>=temp){
//            return 0;
//        }
//        if(num<temp){
//            temp=num;
//            number=number/10;
//        }
//    }
//    return 1;
//}


//3.	Find if a number isBunker, return 1, and 0 otherwise. For example,
//121 1 1+1=2
//        1356 0 1+5!=3+6
    int evenSum = 0;
    int oddSum = 0;
    int cnt = 0;
    int num = n;
    while (num>0){
        cnt++;
        num/10;
    }
    int number = n;
    for (int i = 0; i < cnt; i++){
        int num = number%10;
        if(i%2==0){
            evenSum+=num;
        }
        if(i%2!=0){
            oddSum+=num;
        }
    }
    return evenSum==oddSum?1:0;

    
    // 2,1,1
//    static int isMadhavArray(int[] a){
//        boolean isMadHav=false;
//        for (int i=0; i<a.length; i++){
//            int num = i*(i+1)/2;
//            if (a.length == num){
//                isMadHav=true;
//            }
//        }
//        if(isMadHav==false){
//            return 0;
//        }
//        int prev = a[0];
//        int element=2;
//        for (int i=1; i<a.length; i++){
//            int sum = 0;
//            int cnt=1;
//            while(cnt<=element){
//                sum+=a[i]; //1
//                cnt++; //2
//                if (i<a.length){
//                    i++;
//                }
//            }
//            if(sum!=prev){
//                return 0;
//            }
//            element++;
//            i--;
//        }
//        return 1;
//    }

    //{7, 4,6,11,20,8,9}
//static int isArray(int[] a){
//    int n = a.length;
//    if(a[0]%2==0||a[n-1]%2==0){
//        return 0;
//    }
//    for(int i=1;i<n;i++){
//        int cnt=1;
//        while(cnt<3){
//            if(a[i]%2!=0){
//                return 0;
//            }
//            cnt++;
//            if(i<n-1){
//                i++;
//            }
//        }
//        if(a[i]%2==0){
//            return 0;
//        }
//    }
//    return 1;
//}
}
