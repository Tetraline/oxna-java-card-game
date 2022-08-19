package org.example;


/*
This class helps implement the following logic:

  | Turn      | Said Snap?          | Actually a snap?   | Result   |
  |-----------|---------------------|--------------------|----------|
  | P1's turn | They say Snap       | Snap has happened  | P1 wins  | --
  | P1's turn | They don't say snap | Snap has happened  | P2 wins  | --
  | P2's turn | They say Snap       | Snap has happened  | P2 wins  | --
  | P2's turn | They don't say snap | Snap has happened  | P1 wins  | ---
  | P1's turn | They say Snap       | Snap didn't happen | P2 wins  | ---
  | P1's turn | They don't say snap | Snap didn't happen | Nothing  | ---
  | P2's turn | They say Snap       | Snap didn't happen | P1 wins  | --
  | P2's turn | They don't say snap | Snap didn't happen | Nothing  | ---

    Turn encodes to 0 (player 1) and 1 (player 2)
    Said snap encodes to 1 or 0 (true or false)
    Actually a snap encodes to 1 or 0 (true or false)
 */
public final class ResultMatrix {
    // m [TURN][INPUT][REALITY] = [RESULT]
    private byte[][][] m = new byte[2][2][3];

    public ResultMatrix() {
        m[0][1][1] = 1;
        m[0][0][1] = 2;
        m[1][1][1] = 2;
        m[1][0][1] = 1;
        m[0][1][0] = 2;
        m[0][0][0] = 0;
        m[1][1][0] = 1;
        m[1][0][0] = 0;
    }

    public byte getResult(int turn, int input, int reality) {
        return m[turn][input][reality];
    }
}
