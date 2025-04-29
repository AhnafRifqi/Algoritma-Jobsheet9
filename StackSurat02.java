public class StackSurat02 {
    PraktikumSurat02[] stack;
    int top;
    int size;

    public StackSurat02(int size) {
        this.size = size;
        this.stack = new PraktikumSurat02[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(PraktikumSurat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat.");
        }
    }

    public PraktikumSurat02 pop() {
        if (!isEmpty()) {
            PraktikumSurat02 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public PraktikumSurat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Surat Izin:");
            System.out.println("ID\tNama\tKelas\tJenis\tDurasi");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas
                        + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
            }
        } else {
            System.out.println("Tidak ada surat izin dalam stack.");
        }
    }
}