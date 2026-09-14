t(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for(int k:map.keySet())
        {
            if(map.get(k).size()==3)
            {
                List<Integer> list = map.get(k);

                int a = list.get(0);
                int b = list.get(1);
                int c = list.get(2);

                if(b-a == c-b)
                {
                    count++;
                }
    
            }
        }
        return count;
    }
}