import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (i = 0; i < n / 2; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("phần tử trong mảng là: ");
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        System.out.println("nhập số muốn thêm: ");
        int add = scanner.nextInt();
        System.out.println("nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();

        for (i=n-1;i>=0;i--){
            temp = i-1;
            if(i!= index){
                arr[i] = arr[temp];
            }else break;
        }
        arr[index] = add;
        System.out.println("Elements in array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

