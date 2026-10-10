t d : diff) {
                need += Math.max(0, d - mid);
            }

            if (need <= k) high = mid;
            else low = mid + 1;
        }

        int limit = low;
        long need = 0;
        long ans = 0;

        for (int d : diff) {
            int reduced = Math.min(d, limit);
            need += d - reduced;
            ans += (long) reduced * reduced;
        }

        long remaining = k - need;
        ans -= remaining * (2L * limit - 1);

        return ans;
    }
}