import React, { useState, useEffect } from 'react';
import { useLocation } from 'react-router-dom';

const SubmitPage = () => {
  const location = useLocation();
  
  // 从上一个页面接收的两个固定值
  const { value1, value2 } = location.state || {};

  const [error, setError] = useState('');
  const [isSubmitting, setIsSubmitting] = useState(false);

  // 验证函数（重点在这里修改你的规则）
  const validateValues = () => {
    if (!value1 && value1 !== 0) {
      return '值1 不能为空';
    }
    if (!value2 && value2 !== 0) {
      return '值2 不能为空';
    }

    // ================== 在这里写你的具体验证规则 ==================
    if (typeof value1 === 'string' && value1.trim().length < 3) {
      return '值1 长度至少需要3个字符';
    }

    if (typeof value2 === 'number' && (value2 < 1 || value2 > 10000)) {
      return '值2 必须在 1\~10000 之间';
    }

    // 添加更多规则...
    // if (!/^[A-Z0-9]+$/.test(value1)) return '值1 格式不正确';

    return ''; // 验证通过
  };

  // 组件加载时执行一次验证
  useEffect(() => {
    const errMsg = validateValues();
    setError(errMsg);
  }, [value1, value2]);

  const handleSubmit = (e) => {
    e.preventDefault();
    
    const errMsg = validateValues();
    if (errMsg) {
      setError(errMsg);
      return;
    }

    setIsSubmitting(true);

    // 这里写你的提交逻辑
    console.log('提交数据:', { value1, value2 });
    
    // 模拟提交
    setTimeout(() => {
      alert('提交成功！');
      setIsSubmitting(false);
    }, 800);
  };

  // 安全检查
  if (value1 === undefined || value2 === undefined) {
    return <div className="text-red-600 p-6">错误：未接收到必要参数</div>;
  }

  const isValid = !error;

  return (
    <div className="max-w-lg mx-auto mt-10 p-6">
      <h2 className="text-2xl font-bold mb-6">提交确认页</h2>

      <div className="bg-gray-50 p-5 rounded-lg mb-6 space-y-3">
        <p><strong>值1：</strong> {value1}</p>
        <p><strong>值2：</strong> {value2}</p>
      </div>

      {/* 错误提示 */}
      {error && (
        <div className="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded mb-6">
          ⚠️ {error}
        </div>
      )}

      <button
        onClick={handleSubmit}
        disabled={!isValid || isSubmitting}
        className={`w-full py-4 rounded-lg text-white font-medium text-lg transition-all
          ${isValid 
            ? 'bg-blue-600 hover:bg-blue-700 active:bg-blue-800' 
            : 'bg-gray-400 cursor-not-allowed'}
        `}
      >
        {isSubmitting ? '提交中...' : '确认提交'}
      </button>

      {!isValid && (
        <p className="text-center text-sm text-gray-500 mt-4">
          请修正问题后才能提交
        </p>
      )}
    </div>
  );
};

export default SubmitPage;
