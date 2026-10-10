           if(!map.get(a).equals(map.get(b)))
           {
            return Integer.compare(map.get(a),map.get(b));
           }
             return b.compareTo(a);
        });

        for(String s:map.keySet())
        {
            pq.offer(s);
            if(pq.size()>k) pq.poll();
        }
        List<String> result = new ArrayList<>();
        
        while(!pq.isEmpty())
        {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}