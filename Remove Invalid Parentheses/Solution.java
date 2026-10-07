] &&
                        (x == j || s.charAt(x - 1) != p[1])) {

                        remove(s.substring(0, x) +
                               s.substring(x + 1),
                               ans, k, x, p);
                    }
                }
                return;
            }
        }

        String rev = new StringBuilder(s).reverse().toString();

        if (p[0] == '(')
            remove(rev, ans, 0, 0, new char[]{')', '('});
        else
            ans.add(rev);
    }
}