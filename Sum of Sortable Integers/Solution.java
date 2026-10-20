s2);
    }

    private boolean kmp(int[] text, int[] pattern) {
        int n = text.length,
            m = pattern.length;
        int[] pi = new int[m];
        int j = 0;

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = pi[j - 1];
            }
            if (pattern[i] == pattern[j]) {
                j++;
            }
            pi[i] = j;
        }

        j = 0;
        for (int i = 0; i < n; i++) {
            while (j > 0 && text[i] != pattern[j]) {
                j = pi[j - 1];
            }
            if (text[i] == pattern[j]) {
                j++;
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }
}