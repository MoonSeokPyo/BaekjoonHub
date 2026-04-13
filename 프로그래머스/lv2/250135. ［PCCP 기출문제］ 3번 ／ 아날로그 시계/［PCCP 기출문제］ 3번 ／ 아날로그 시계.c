#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
    int answer = 0;
    unsigned int s = s1, m = (m1 * 60) + s, h = (h1 * 3600) + m, Second = 100;
    unsigned int Location, Increase = 1;
    unsigned int End_s = s2, End_m = (m2 * 60) + End_s, End_h = (h2 * 3600) + End_m;
    unsigned int _12Hour = 12 * 3600, _1Hour = 1 * 3600;

    s = s * Second;
    m = m * Second;
    h = h * Second;
    End_s = Second * End_s;
    End_m = Second * End_m;
    End_h = Second * End_h;
    _12Hour = _12Hour * Second;
    _1Hour = _1Hour * Second;

    while (true) {
        if (h >= _12Hour) {
            Location = h - _12Hour;
            if ((s == Location / 720) || (s == m / 60)) {
                answer++;
                if ((s == Location / 720) && (s == m / 60) && (Location / 60 != m)) {
                    answer++;
                }
                if (m == _1Hour - 1)
                    answer--;
            }
        }
        else {
            if ((s == h / 720) || (s == m / 60)) {
                answer++;
                if ((s == h / 720) && (s == m / 60) && (h / 60 != m)) {
                    answer++;
                    if (h == _12Hour - 1)
                        answer--;
                }
                if (m == _1Hour - 1)
                    answer--;
            }
        }

        if (s + Increase == 6000) {
            s = 0;
            if (m + Increase == 360000) {
                m = 0;
                h += Increase;
            }
            else {
                m += Increase;
                h += Increase;
            }
        }
        else {
            s += Increase;
            m += Increase;
            h += Increase;
        }
        

        if ((h == End_h) && (m == End_m) && (s == End_s)) {
            if (h >= _12Hour) {
                Location = h - _12Hour;
                if ((s == Location / 720) || (s == m / 60)) {
                    answer++;
                    if ((s == Location / 720) && (s == m / 60) && (Location / 60 != m)) {
                        answer++;
                    }
                    if (m == _1Hour - 1)
                        answer--;
                }
            }
            else {
                if ((s == h / 720) || (s == m / 60)) {
                    answer++;
                    if ((s == h / 720) && (s == m / 60) && (h / 60 != m)) {
                        answer++;
                    }
                    if (m == _1Hour - 1)
                        answer--;
                }
            }
            break;
        }
            
    }
    return answer;
}