package com.borlok.patternspractice.behaviorpatterns.iterator;

public class Cars implements Collection {
    private String markName;
    private String [] models;

    public Cars(String markName, String[] models) {
        this.markName = markName;
        this.models = models;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String[] getModels() {
        return models;
    }

    public void setModels(String[] models) {
        this.models = models;
    }

    @Override
    public Iterator getIterator() {
        return new ModelIterator();
    }

    private class ModelIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < models.length;
        }

        @Override
        public Object next() {
            return models[index++];
        }
    }
}
