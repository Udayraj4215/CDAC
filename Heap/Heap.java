public class Heap {
    void heapify(int arr[], int n, int i) {
        int largest = i;   // Root
        int l = 2 * i + 1; // Left child
        int r = 2 * i + 2; // Right child

        // Check if left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // Check if right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    void buildHeap(int arr[], int n) {
        // Build a maxheap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    void heapsort(int arr[]) {
        int n = arr.length; // n is length of arr

        // Build max heap
        buildHeap(arr, n);

        // One by one extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap h1 = new Heap();
        int[] arr = {99, 66, 77, 44, 33, 88, 11};
        
        System.out.println("Original Array:");
        h1.display(arr);

        h1.heapsort(arr);
        
        System.out.println("Sorted Array:");
        h1.display(arr);
    }
}