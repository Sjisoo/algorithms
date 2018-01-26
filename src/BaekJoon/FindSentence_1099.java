package BaekJoon;

import java.util.Scanner;

class FindSentence{


    static int[] alpha = new int[26];

    int answer;

    public void alpha_initial(){
        this.alpha = new int[26];
    }

//    public int run(){
//        return answer;
//    }

    // 받아 올 len은 Nstr
    // sentence를 N번째 단어의 개수로 잘라내기
    public int slice(String sent, String[] len){
        if(sent.length()==0){
            return answer;
        }
        int min = -1;
        int temp;
        int num = 0;
        int count = 0;
        for(int i=0; i<len.length; i++){
            String sentence_split = sent.substring(0,len[i].length());
            sentence_add(sentence_split);
            if(TF(len[i])){
                count++;
                temp = find_min(len[i],sentence_split);
                if(min != -1){
                    if(min>temp){
                        min = temp;
                        num = i;
                    }
                } else{
                    min = temp;
                    num = i;
                }
            }
        }
        if (count == 0){
            return -1;
        }
        answer += min;
        // N개의 단어 중 가장 적은 것 선택
        // 그 후, 문장 아예 잘라내버리기
        String res_sent = sent.substring(len[num].length(),sent.length());
        return  slice(res_sent,len);
    }

    // 잘려진 sentence의 각각 알파벳대로 큰 alpha 배열에 ++
    public void sentence_add(String splited){
        for(int j=0; j<splited.length(); j++){
            int ascii = (int)splited.charAt(j);
            alpha[ascii-97]++;
        }
    }

    // 참 or 거짓 판단
    // N번째 단어와 비교 후 큰 alpha 배열 --
    public boolean TF(String word){
        int length = word.length();
        for(int k=0; k<length; k++){
            if(alpha[(int)word.charAt(k)-97]>0){
                alpha[(int)word.charAt(k)-97]--;
            }
            else{
                alpha_initial();
                return false;
            }
        }
        return  true;
    }

    // N번째 단어와 잘려진 문장 직접 비교 후 해당 위치에 없으면 count++(answer)
    public int find_min(String word, String splited){
        int count = 0;
        for(int a = 0; a<word.length(); a++){
            if(word.charAt(a)!=splited.charAt(a)){
                count++;
            }
        }
        return count;
    }
}

public class FindSentence_1099{
    public static void main(String[] args){

        String sentence;
        int N;
        Scanner scan = new Scanner(System.in);
        sentence = scan.next();
        N = scan.nextInt();
        String[] Nstr = new String[N];

        for(int i=0; i<N; i++){
            Nstr[i] = scan.next();
        }


        FindSentence fs = new FindSentence();
        fs.answer = 0;
        System.out.print(fs.slice(sentence,Nstr));

    }
}
