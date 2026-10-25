                ans1++;
                }
                l[ans1]++;
            }

            boolean[] seen2 = new boolean[27];
            int ans2 = 0;
            
            for(int k = i + 1; k < n; k++){
                int c = s.charAt(k) - 'a';

                if(seen2[c] == false){
                    seen2[c] = true;
                    ans2++;
                }

                r[ans2]++;
            }

            for(int x = 1; x <= 26; x++){
                res += l[x] * r[x];
            }
        }
        return res;
    }
}