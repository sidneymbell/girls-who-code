"""
The purpose of this script is count the number of A,G,C,T in a nucleotide string.

SKH 20180108
"""

def main():
    nts = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"

    print("The length of the nucleotide string is {0}".format(len(nts)))
    print("We want to count the number of A, G, C, and Ts in the string {0}".format(nts))

    # Let's keep track of the nucleotides using variables
    A = 0
    C = 0
    G = 0
    T = 0

    for nt in nts:
        if nt == "A":
            A += 1
        elif nt == "C":
            C += 1
        elif nt == "G":
            G += 1
        elif nt == "T":
            T += 1
        else:
            raise ValueError("Unexpected nt! {0}".format(nt))
    print("{0} {1} {2} {3}".format(A, C, G, T))

    # Let's keep track of the nucleotides using a list
    final = [0, 0, 0, 0]

    for nt in nts:
        if nt == "A":
            final[0] += 1
        elif nt == "C":
            final[1] += 1
        elif nt == "G":
            final[2] += 1
        elif nt == "T":
            final[3] += 1
        else:
            raise ValueError("Unexpected nt! {0}".format(nt))
    print("{0} {1} {2} {3}".format(final[0], final[1], final[2], final[3]))
    assert sum(final) == len(nts)

    # Let's keep track of the nucleotides using a dictinoary
    final = {"A":0, "C":0, "G":0, "T":0}

    for nt in nts:
        final[nt] += 1
    print("{0} {1} {2} {3}".format(final["A"], final["C"], final["G"], final["T"]))

    # Let's use a built-in python function
    A = nts.count("A")
    C = nts.count("C")
    G = nts.count("G")
    T = nts.count("T")

    print("{0} {1} {2} {3}".format(A,C,G,T))


if __name__ == '__main__':
    main()
