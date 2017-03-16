package kumar116;

public class BinarySearchTree<T extends Comparable<T>> {

  private Node<T> head;

  public class Node<E> {
    public E data;
    public Node<E> left;
    public Node<E> right;

    public Node(E data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public void insert(T data) {
    head = insert(head, data);
  }

  private Node<T> insert(Node<T> head, T data) {
    if (head == null) {
      head = new Node(data);
    } else {
      if (((T) head.data).compareTo(data) <= 0) {
        head.right = insert(head.right, data);
      } else {
        head.left = insert(head.left, data);
      }
    }
    return head;
  }

  public void delete(T data) {
    head = delete(head, data);
  }

  public Node<T> delete(Node<T> head, T data) {
    if (head == null) {
      return null;
    }
    if (((T) head.data).compareTo(data) < 0) {
      head.right = delete(head.right, data);
    } else if (((T) head.data).compareTo(data) > 0) {
      head.left = delete(head.left, data);
    } else {
      if (head.left == null) {
        return head.right;
      } else if (head.right == null) {
        return head.left;
      } else {
        T newData = successor(head.right);
        head.data = newData;
        head.right = delete(head.right, newData);
        return head;
      }
    }
    return head;
  }

  public String inorder() {
    return inorder(head);
  }

  private String inorder(Node<T> head) {
    if (head == null) {
      return "";
    } else {
      return inorder(head.left) + head.data.toString() + inorder(head.right);
    }
  }

  public String preorder() {
    return preorder(head);
  }

  private String preorder(Node<T> head) {
    if (head == null) {
      return "";
    } else {
      return head.data.toString() + preorder(head.left) + preorder(head.right);
    }
  }

  public String postorder() {
    return postorder(head);
  }

  public String postorder(Node<T> head) {
    if (head == null) {
      return "";
    } else {
      return postorder(head.left) + postorder(head.right) + head.data.toString();
    }
  }

  public T minimum() {
    if (head == null) {
      return null;
    }
    return minimum(head);
  }

  private T minimum(Node<T> head) {
    if (head.left == null) {
      return head.data;
    } else {
      return minimum(head.left);
    }
  }

  public T maximum() {
    if (head == null) {
      return null;
    }
    return maximum(head);
  }

  private T maximum(Node<T> head) {
    if (head.right == null) {
      return head.data;
    } else {
      return maximum(head.right);
    }
  }

  public T search(T data) {
    return search(head, data);
  }

  private T search(Node<T> head, T data) {
    if (head == null) {
      return null;
    } else {
      if (((T) head.data).compareTo(data) == 0) {
        return head.data;
      }
      if (((T) head.data).compareTo(data) <= 0) {
        return search(head.right, data);
      } else {
        return search(head.left, data);
      }
    }
  }

  private T successor(Node<T> head) {
    if (head.left == null && head.right == null) {
      return head.data;
    }
    return successor(head.left);
  }
}
