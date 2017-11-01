
package projetoutilizandoconcorrencia.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapOrder  extends HashMap<String,Integer[]> {
    
    public HashMapOrder() {
        super();
    }
  
    private Entry getFirst() {
            return this.entrySet().iterator().next();
    }
    
    public String removeFirst() {
          String key = (String) getFirst().getKey();
          this.remove(key);
          return key;
    }

    @Override
    public Set<Entry<String,Integer[]>> entrySet() {
        //Onde [0] = Prioridade, [1] = Tamanho
        List<Entry<String,Integer[]>> entries = new ArrayList<>(super.entrySet());
        Collections.sort(entries, (Map.Entry<String,Integer[]> o1, Map.Entry<String,Integer[]> o2) -> {
            if (o1.getValue()[0] != o2.getValue()[0] ) {
                return (o1.getValue()[0]  > o2.getValue()[0]) ? (-1) : 1;
            } else {
                return (o1.getValue()[1]).compareTo(o2.getValue()[1]);
            }
        });
        return new LinkedHashSet<>(entries);
    }
 }
    