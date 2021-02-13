package com.codingChallenge.KthSymbolInGrammar;

public class KthSymbolInGrammar {

    public static int kthGrammar(int N, int K) {
        if(N == 1) return 0;
        if(K <= 1) return 0;

        if(K % 2 == kthGrammar(N-1, (K/2 + K%2))){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
