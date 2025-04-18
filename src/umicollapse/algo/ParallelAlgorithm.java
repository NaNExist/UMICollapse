package umicollapse.algo;

import java.util.List;
import java.util.Map;

import umicollapse.util.BitSet;
import umicollapse.util.ReadFreq;
import umicollapse.util.Read;
import umicollapse.util.ClusterTracker;
import umicollapse.data.ParallelDataStructure;

public interface ParallelAlgorithm extends Algo{
    // 根据给定的reads、data、tracker、umiLength、k和percentage参数，返回一个Read类型的列表
    public List<Read> apply(Map<BitSet, ReadFreq> reads, ParallelDataStructure data, ClusterTracker tracker, int umiLength, int k, float percentage);
}
