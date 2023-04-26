

    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    
    transient Object[] elementData; // non-private to simplify nested class access

    public boolean add(E e) {

        add(e, elementData, size);  // 新元素， 数组， 0
        return true;
    }
    private int size;       // 第一次默认为0

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)    // 第一次运行时，s（size） = 0,也就是判断数组长度是否为0, 第二次运行就要到s为10了
            // elementData = new Object[Math.max(DEFAULT_CAPACITY 10, minCapacity 1)]
            elementData = grow();       // 第一次运行，数组长度一定为0，所以grow()扩充数组, 第二次运行就要到s为10了
        elementData[s] = e;             // 第一次运行 元素e添加到  elementData[0]位置
        size = s + 1;                   // 并将size++
    }

    private Object[] grow() {
        return grow(size + 1);
    }


    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;           // 第一次长度为0，oldCapacity = 0, 第二次运行长度为10,
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {  第二次运行时长度为> 0 || 用的带有参数的构造器
            int newCapacity = ArraysSupport.newLength(oldCapacity,  // (10, 11-10, 5)
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return elementData = Arrays.copyOf(elementData, newCapacity);   // 老数组元素已经有10个,达到了上限,所以数组增加50%的长度
        } else {
            // new Object[Math.max(10, 1)];    第一次运行时，new Object[10]
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    private static final int DEFAULT_CAPACITY = 10;
    
    // 第二次添加元素时,长度就 > 0,或者用户实例化ArrayList时手动指定了长度,例如:new ArrayList(20)
    public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {      // 用户手动指定长为,就new Object[用户要求的长度];
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;   // 用户指定长度为0, 就new ArrayList() {} 
        } else {    // 用户如果指定长度 < 0, 就报错
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
    }

    private static final Object[] EMPTY_ELEMENTDATA = {};