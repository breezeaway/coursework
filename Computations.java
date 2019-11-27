public class Computations {
    public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("881457");
            }
            if (args.length == 1) {
                final long N = Long.parseLong(args[0]);
                double sum = 0.0;
                for (long i = N; i > 0; i--){
                sum = 1.0/(i*i) + sum;
                }
                System.out.println(sum);
            }
            if (args.length == 2) {
                final int x = Integer.parseInt(args[0]);
                final int y = Integer.parseInt(args[1]);               
				final long te = x;
				final long tr = y;
                final long p = te*tr;
				final long s = te+tr;
				final long s2 =  ((-te) + (-tr));
                if (p < Integer.MAX_VALUE && p > Integer.MIN_VALUE) {
                    System.out.println(p);
                }
                else if (s < Integer.MAX_VALUE && s > Integer.MIN_VALUE) {
                    System.out.println(s);
                }
                else {
                    System.out.println(s2);
                }
            }
            if (args.length == 3) {
                final int a = Integer.parseInt(args[0]);
                final int b = Integer.parseInt(args[1]);
                final int c = Integer.parseInt(args[2]);
                    if (b > a && c > 0  && c != 0) {
                        for (int i = a; i <= b ; i += c) {
                            System.out.println(i);
                        }
                    }
                    else if (a > b && c < 0  && c != 0) {
                        for (int j = a; j >= b; j += c) {
                            System.out.println(j);
                        }
					}
					else {
						System.out.println(a);
					}
            }
            if (args.length == 4) {
                final String temp = args[0];
                final String temp1 = args[1];
                final String temp2 = args[2];
                final String temp3 = args[3];
                final int t = temp.length();
                final int t1 = temp1.length();
                final int t2 = temp2.length();
                final int t3 = temp3.length();
                if (t % 2 != 0) {
                    System.out.println("\"" + temp + "\"");
                }
                if (t1 % 2 != 0) {
                    System.out.println("\"" + temp1 + "\"");
                }
                if (t2 % 2 !=0) {
                    System.out.println("\"" + temp2 + "\"");
                }
                if (t3 % 2 !=0) {
                    System.out.println("\"" + temp3 + "\"");
                }
            }
            if (args.length >= 5) {
                int [] mem = new int [args.length];
                int [] frq = new int [mem.length];
				int vis = -1;
				for (int i = 0; i < args.length; i++) {
                    mem[i] = Integer.parseInt(args[i]);
                }
                for(int i = 0; i < mem.length; i++){
                    int count = 1;
                    for(int j = i+1; j < mem.length; j++){
                        if(mem[i] == mem[j]){
                            count++;
                            frq[j] = vis;
                        }
                    }
                    if(frq[i] != vis)
                        frq[i] = count;
                }
                String dis = "true";
                for(int i = 0; i < frq.length; i++){
                    if(frq[i] != vis){
                        if(frq[i] != 2) {
                            dis = "false";
                        }
                    }
                }
                System.out.println(dis);
            }
        }
    }