package br.com.capgemini.desafio;
import java.util.Arrays;
import java.util.HashMap;
  
public class Questao03 {
  
    public static int contaAnagramas(String palavra){
        
    	HashMap<String, Integer> map= new HashMap<>();
  
        for(int i = 0; i < palavra.length(); i++){
            
        	for(int j = i; j < palavra.length(); j++){
                
        		char[] valChar = palavra.substring(i, j + 1).toCharArray();
                
        		Arrays.sort(valChar);
                
        		String val = new String(valChar);
                
        		if (map.containsKey(val)) 
                    map.put(val, map.get(val) + 1);
                else 
                    map.put(val, 1);
            }
        }
        
        int totalDePares = 0;
        
        for(String key: map.keySet()){
            
        	int n = map.get(key);
            
        	totalDePares += (n * (n-1))/2;
        }
        
        return totalDePares;
    }
}