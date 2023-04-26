    @Test
    public void test1(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mini", 25);

    }            
    &是与运算符，与的规则是转换成二进制比较，同时为1得1，其余情况为0.         15 & 2398291  =  3  
    
    ^是或运算符，或的规则是转换成二进制比较，同时为0得0，其余情况为1.
    
    ^是异或运算符，异或的规则是转换成二进制比较，相同为0，不同为1
                                                                             1111           15
                                                    0010 0100 1001 1000 0101 0011           2398291      
                                                                        0000 0011           3   

    public HashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted 0.75f
    }

    static final float DEFAULT_LOAD_FACTOR = 0.75f;     默认因子为0.75f

    final float loadFactor;                             加载因子0.75f

    ----------------------上面就是 HashMap<String, Integer> map = new HashMap<>();的动作
    ----------------------下面就是put("Mini", 25);   的动作

    public V put(K key, V value) {              put("Mini", 25)
        return putVal(hash(key), key, value, false, true);      // 首次添加(2398291, "Mini", 25, null)到table[3]号位置 next为null  另外 hash("Mini")
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);   // 使用的String类里面的hashCode()
    }
                      (2398291, "Mini",  25,    false, true)
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)     // 首次map.put()添加元素table == null
            n = (tab = resize()).length;                    // 首次map.put(),table.length长度为0  所以先扩容,扩容后n = 16
        if ((p = tab[i = (n - 1) & hash]) == null)          // 首次添加 一个元素在3号  15 & 2398291  =  3 , 3位置 == null吗? 是为Null
            tab[i] = newNode(hash, key, value, null);       // 首次添加(2398291, "Mini", 25, null)到table[3]号位置 next为null
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)                     // 判断当前元素个数是否达到阀值 12个,true就再扩容,false就
            resize();
        afterNodeInsertion(evict);
        return null;
    }

    transient Node<K,V>[] table;                null

    int threshold;                              0

    static final int MAXIMUM_CAPACITY = 1 << 30;                1,073,741,824

    // Integer类里的常量值 
    @Native public static final int   MAX_VALUE = 0x7fffffff;
    @Native public static final int   MIN_VALUE = 0x80000000;   4G。0x80000000是十六进制表示的，二进制是1000 0000 0000 0000 0000 0000 0000 0000
                                                                十进制是2的32次方 即 4294967296

    final Node<K,V>[] resize() {            // 扩容方法
        Node<K,V>[] oldTab = table;         // null,先造一个Node[]
        int oldCap = (oldTab == null) ? 0 : oldTab.length;      // 首次添加为0, Node[]超过12个元素,但是元素i位置上有空位再忍忍,
        int oldThr = threshold;                                 // 0
        int newCap, newThr = 0;
        if (oldCap > 0) {       // 首次添加oldCap为0,也就是老Node[]数组长度为0,添加过元素后,这个长度值就 > 0了
            if (oldCap >= MAXIMUM_CAPACITY) {       // 老数组Node[]超过1,073,741,824个元素,
                threshold = Integer.MAX_VALUE;      // 就直接将阀值threshold设置为2的32次方 即 4294967296
                return oldTab;                      // 再将老数组长度返回去
            }
            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&   // 扩容oldCap老数组长度 * 2 < 1,073,741,824个元素
                     oldCap >= DEFAULT_INITIAL_CAPACITY)    //    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
                newThr = oldThr << 1; // double threshold
        }
        else if (oldThr > 0) // initial capacity was placed in threshold    // 当Node[]有元素时,oldThreshold
            newCap = oldThr;
        else {               // zero initial threshold signifies using defaults
            newCap = DEFAULT_INITIAL_CAPACITY;                              // 16长度Node[]
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY); //  0.75f * 16 = 12 个阀值 
        }
        if (newThr == 0) {
            float ft = (float)newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                      (int)ft : Integer.MAX_VALUE);
        }
        threshold = newThr;                                             // 将阀值给threshold阀值 变量
        @SuppressWarnings({"rawtypes","unchecked"})
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];             // 申明一个新newTab[16]数组,为扩容作准备
        table = newTab;
        if (oldTab != null) {
            for (int j = 0; j < oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) != null) {
                    oldTab[j] = null;
                    if (e.next == null)
                        newTab[e.hash & (newCap - 1)] = e;
                    else if (e instanceof TreeNode)
                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node<K,V> loHead = null, loTail = null;
                        Node<K,V> hiHead = null, hiTail = null;
                        Node<K,V> next;
                        do {
                            next = e.next;
                            if ((e.hash & oldCap) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTab[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTab[j + oldCap] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab;
    }


    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16

    Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {   // 首次添加(2398291, "Mini", 25, null) next为null
        return new Node<>(hash, key, value, next);                  // 首次添加(2398291, "Mini", 25, null) next为null
    }

    static class Node<K,V> implements Map.Entry<K,V> {      // 内部类Node, 带有next属性为意向链表
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {    // 首次添加(2398291, "Mini", 25, null) next为null
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }