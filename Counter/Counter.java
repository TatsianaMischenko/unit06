package by.epam.Counter;

public class Counter {

    private int minCount;
    private int maxCount;
    private int initCount;
    private int count;
    private int step = 1;

    public Counter() {
        minCount = 0;
        maxCount = 9999999;
        initCount = 0;
        count = initCount;
        step = 1;
    }

    public Counter(int _minCount, int _maxCount) {
        if (_minCount >= _maxCount) {
            throw new RuntimeException("minCount must be lower then maxCount");
        }

        minCount = _minCount;
        maxCount = _maxCount;
    }

    public Counter(int _minCount, int _maxCount, int _initCount) {
        if (_minCount >= _maxCount) {
            throw new RuntimeException("minCount must be lower then maxCount.");
        }
        if (_initCount < _minCount || _initCount >= _maxCount) {
            throw new RuntimeException("initCount can't be less then minCount or greater then maxCount.");
        }

        minCount = _minCount;
        maxCount = _maxCount;
        initCount = _initCount;
    }

    public Counter(int _minCount, int _maxCount, int _initCount, int _step) {
        if (_minCount >= _maxCount) {
            throw new RuntimeException("minCount must be lower then maxCount.");
        }
        if (_initCount < _minCount || _initCount >= _maxCount) {
            throw new RuntimeException("initCount can't be less then minCount or greater then maxCount.");
        }
        if (_step <= 0 || _step >= _maxCount) {
            throw new RuntimeException("Step must be greater then 0 and less then maxCount.");
        }

        minCount = _minCount;
        maxCount = _maxCount;
        initCount = _initCount;
        step = _step;
    }

    public int getCount() {
        return count;
    }

    public int getInitCount() {
        return initCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int _minCount) {
        if (_minCount >= maxCount) {
            throw new RuntimeException("minCount must be lower then maxCount.");
        }

        minCount = _minCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int _maxCount) {
        if (_maxCount <= minCount) {
            throw new RuntimeException("maxCount must be greater then minCount.");
        }

        maxCount = _maxCount;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int _step) {
        if (_step <= 0 || _step >= maxCount) {
            throw new RuntimeException("Step must be greater then 0 and less then maxCount.");
        }

        step = _step;
    }

    public int increase() {
        int newCount = count + step;
        if (newCount <= maxCount) {
            count = newCount;
        }
        return count;
    }

    public int decrease() {
        int newCount = count - step;
        if (newCount >= minCount) {
            count = newCount;
        }
        return count;
    }
}