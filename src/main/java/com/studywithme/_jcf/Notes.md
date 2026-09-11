List
│
├── Mutable List
│   │
│   ├── Sorting
│   │   ├── Collections
│   │   ├── Comparator
│   │   ├── List.sort()
│   │   └── Stream
│   │
│   └── Printing
│       ├── Directly
│       ├── forEach
│       ├── Stream
│       └── Iterator
│
└── Immutable List
│
├── Sorting
│   ├── Stream
│   └── Create New List
│
└── Printing
├── Directly
├── forEach
├── Stream
└── Iterator


Sorting
│
├── Ascending
│   ├── Collections.sort()
│   ├── List.sort()
│   ├── Comparator.naturalOrder()
│   └── Stream.sorted()
│
└── Descending
├── Collections.sort()
├── List.sort()
├── Comparator.reverseOrder()
└── Stream.sorted()


Comparator
│
├── Anonymous Class
├── Lambda
├── Method Reference
├── Comparator.naturalOrder()
├── Comparator.reverseOrder()
└── Comparator.reversed()


Collections
│
├── Collections.sort(list)
├── Collections.sort(list, comparator)
└── Collections.reverseOrder()


Stream
│
├── sorted()
├── sorted(comparator)
└── toList()


List
│
├── sort(comparator)
└── reversed()              // Java 21+


